CREATE TABLE tb_card (
id INT PRIMARY KEY AUTO_INCREMENT,
code VARCHAR(18)
);
INSERT INTO tb_card (code) VALUES ('330327199405080250');

CREATE TABLE tb_preson (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR (18),
sex VARCHAR (18),
age INT ,
card_id INT UNIQUE ,
FOREIGN KEY (card_id) REFERENCES tb_card (id)
);
INSERT INTO tb_preson (name, sex, age, card_id) VALUES ('jack','男',23,1);