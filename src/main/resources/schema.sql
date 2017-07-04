/* 一对一 */
CREATE TABLE tb_card (
  id   INT PRIMARY KEY AUTO_INCREMENT,
  code VARCHAR(18)
);
INSERT INTO tb_card (code) VALUES ('330327199405080250');

CREATE TABLE tb_preson (
  id      INT PRIMARY KEY AUTO_INCREMENT,
  name    VARCHAR(18),
  sex     VARCHAR(18),
  age     INT,
  card_id INT UNIQUE,
  FOREIGN KEY (card_id) REFERENCES tb_card (id)
);
INSERT INTO tb_preson (name, sex, age, card_id) VALUES ('jack', '男', 23, 1);

/* 一对多 */
CREATE TABLE tb_clazz (
  id   INT PRIMARY KEY AUTO_INCREMENT,
  code VARCHAR(18),
  name VARCHAR(18)
);
INSERT INTO tb_clazz (code, name) VALUES ('jk1601', '计算机科学与技术');

CREATE TABLE tb_student (
  id       INT PRIMARY KEY AUTO_INCREMENT,
  name     VARCHAR(18),
  sex      VARCHAR(18),
  age      INT,
  clazz_id INT,
  FOREIGN KEY (clazz_id) REFERENCES tb_clazz (id)
);
INSERT INTO tb_student(name, sex, age, clazz_id) VALUES ('jack','男',23,1);
INSERT INTO tb_student(name, sex, age, clazz_id) VALUES ('rose','女',18,1);
INSERT INTO tb_student(name, sex, age, clazz_id) VALUES ('tom','男',21,1);
INSERT INTO tb_student(name, sex, age, clazz_id) VALUES ('alice','女',20,1);