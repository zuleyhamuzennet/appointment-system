INSERT INTO doctor(id, name, regist_num) VALUES ('1','Jessey','6692547425');
INSERT INTO doctor(id, name, regist_num) VALUES ('2','Steve','6692547421');
INSERT INTO doctor(id, name, regist_num) VALUES ('3','Harsh','6692547422');
INSERT INTO doctor(id, name, regist_num) VALUES ('4','Simple','6692547423');
INSERT INTO doctor(id, name, regist_num) VALUES ('5','Shakira','6692547424');
INSERT INTO doctor(id, name, regist_num) VALUES ('6','Cynthia','6692547428');
INSERT INTO doctor(id, name, regist_num) VALUES ('7','broadly','6692547427');

INSERT INTO patient(id, name, age, tc) VALUES ('1','Broadly','15','12345788');
INSERT INTO patient(id, name, age, tc) VALUES ('2','Züleyha','25','12345789');
INSERT INTO patient(id, name, age, tc) VALUES ('3','Harun','35','12345755');
INSERT INTO patient(id, name, age, tc) VALUES ('4','Umut','30','12345769');
INSERT INTO patient(id, name, age, tc) VALUES ('5','Selin','22','12345768');
INSERT INTO patient(id, name, age, tc) VALUES ('6','Hasan','43','12345732');
INSERT INTO patient(id, name, age, tc) VALUES ('7','Merve','50','12345785');

INSERT INTO city(id, name) VALUES ('1','İstanbul');
INSERT INTO city(id, name) VALUES ('2','Ankara');
INSERT INTO city(id, name) VALUES ('3','Sakarya');
INSERT INTO city(id, name) VALUES ('4','İzmir');
INSERT INTO city(id, name) VALUES ('5','Bursa');
INSERT INTO city(id, name) VALUES ('6','Antalya');

INSERT INTO hospital(id, name,city_id) VALUES ('1','Arnavutköy Devlet Hastanesi','1');
INSERT INTO hospital(id, name,city_id) VALUES ('2','Bayrampaşa Devlet Hastanesi.','1');
INSERT INTO hospital(id, name,city_id) VALUES ('3','Beşiktaş Sait Çiftçi Devlet Hastanesi','1');
INSERT INTO hospital(id, name,city_id) VALUES ('4','Beykoz Devlet Hastanesi.','1');
INSERT INTO hospital(id, name,city_id) VALUES ('5','Esenyurt Devlet Hastanesi.','1');
INSERT INTO hospital(id, name,city_id) VALUES ('6','Eyüp Devlet Hastanesi.','1');
INSERT INTO hospital(id, name,city_id) VALUES ('7','Lütfiye Nuri Burat Devlet Hastanesi ','1');
INSERT INTO hospital(id, name,city_id) VALUES ('8','Akyurt Devlet Hastanesi.','2');
INSERT INTO hospital(id, name,city_id) VALUES ('9','Ankara Numune Eğitim ve Araştırma Hastanesi.','2');
INSERT INTO hospital(id, name,city_id) VALUES ('10','Dışkapı Yıldırım Beyazıt Eğitim ve Araştırma Hastanesi','2');
INSERT INTO hospital(id, name,city_id) VALUES ('11','Beypazarı Devlet Hastanesi','2');
INSERT INTO hospital(id, name,city_id) VALUES ('12','Türkiye Yüksek İhtisas Eğitim ve Araştırma Hastanesi.','2');
INSERT INTO hospital(id, name,city_id) VALUES ('13','Ankara Bilkent Şehir Hastanesi','2');
INSERT INTO hospital(id, name,city_id) VALUES ('14','Halil Şıvgın Çubuk Devlet Hastanesi. ','2');

INSERT INTO clinic(id, name) VALUES ('1','cildiye');
INSERT INTO clinic(id, name) VALUES ('2','Anestezi Polikliniği.');
INSERT INTO clinic(id, name) VALUES ('3','Aşı Merkezi');
INSERT INTO clinic(id, name) VALUES ('4','Enfeksiyon Hastalıkları Polikliniği');
INSERT INTO clinic(id, name) VALUES ('5','Aile Hekimliği');
INSERT INTO clinic(id, name) VALUES ('6','Göz Polikliniği');

INSERT INTO hospital_clinics(hospital_id, clinic_id) VALUES ('1','1');
INSERT INTO hospital_clinics(hospital_id, clinic_id) VALUES ('1','2');
INSERT INTO hospital_clinics(hospital_id, clinic_id) VALUES ('1','3');
INSERT INTO hospital_clinics(hospital_id, clinic_id) VALUES ('1','4');
INSERT INTO hospital_clinics(hospital_id, clinic_id) VALUES ('1','5');



