package com.zjgsu.web;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by zby on 2017/7/2.
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String uploadForm(){
        return "uploadForm";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request,
                         @RequestParam("description") String description,
                         @RequestParam("file")MultipartFile file,
                         Model model) throws IOException {
        System.out.println(description);
        if (!file.isEmpty()){
            String path = request.getServletContext().getRealPath("/images");
            String filename = file.getOriginalFilename();
            File filepath = new File(path,filename);
            if (!filepath.getParentFile().exists()){
                filepath.getParentFile().mkdirs();
            }
            System.out.println("文件位置:" + path + File.separator + filename);
            file.transferTo(new File(path + File.separator + filename));
            model.addAttribute("filepath",filename);
            return "successPage";
        } else {
            return "errorPage";
        }
    }

    @RequestMapping(value = "/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request,
                                           @RequestParam("filename") String filename,
                                           Model model) throws IOException {
        String path = request.getServletContext().getRealPath("/images");
        File file = new File(path + File.separator + filename);
        HttpHeaders headers = new HttpHeaders();
        String downloadFilename = new String(filename.getBytes("UTF-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment", downloadFilename);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }
}
