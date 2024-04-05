-- Создаем БД Human_friend.
DROP DATABASE IF EXISTS Human_friend;
CREATE DATABASE Human_friend;

USE Human_friend;

-- Создаем таблицу animal и заполняем данными
DROP TABLE IF EXISTS animal;
CREATE TABLE animal (
	id INT AUTO_INCREMENT PRIMARY KEY, 
	animal_name VARCHAR(25)
);

INSERT INTO
	animal (animal_name)
VALUES 
	('Pets'),
	('Pack_Animals');
    
-- Создаем таблицу pet и заполняем данными
DROP TABLE IF EXISTS pet;
CREATE TABLE pet (
	id INT AUTO_INCREMENT PRIMARY KEY,
	animal_id INT,
	pet_name VARCHAR (25),
	FOREIGN KEY (animal_id) REFERENCES animal (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO 
	pet (animal_id, pet_name )
VALUES 
	(1, 'Cat'),
	(1, 'Dog'),  
	(1, 'Hamster');

-- Создаем таблицу pack_animal и заполняем данными
DROP TABLE IF EXISTS pack_animal;
CREATE TABLE pack_animal (
	id INT AUTO_INCREMENT PRIMARY KEY,
	animal_id INT,
	pack_animal_name VARCHAR (25),
	FOREIGN KEY (animal_id) REFERENCES animal (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO 
	pack_animal (animal_id, pack_animal_name )
VALUES
	(2, 'Horses'),
	(2, 'Donkeys'),  
	(2, 'Camels'); 

-- Создаем таблицу cat и заполняем данными
DROP TABLE IF EXISTS cat;
CREATE TABLE cat (       
	id INT AUTO_INCREMENT PRIMARY KEY,
	pet_id INT, 
	cat_name VARCHAR(25), 
	birthday DATE,
	command VARCHAR(45),
	FOREIGN KEY (pet_id) REFERENCES pet (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO 
	cat (pet_id, cat_name, birthday, command)
VALUES 
	(1, 'Whiskers', '2019-05-15', 'Sit, Pounce'),
	(1, 'Smudge', '2020-02-20', 'Sit, Pounce, Scratch'),  
	(1, 'Oliver', '2020-06-30', 'Meow, Scratch, Jump'); 

-- Создаем таблицу dog и заполняем данными
DROP TABLE IF EXISTS dog;
CREATE TABLE dog (       
	id INT AUTO_INCREMENT PRIMARY KEY,
	pet_id INT, 
	dog_name VARCHAR(25), 
	birthday DATE,
	command VARCHAR(45),
	FOREIGN KEY (pet_id) REFERENCES pet (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO 
	dog (pet_id, dog_name, birthday, command)
VALUES 
	( 2, 'Fido','2020-01-01', 'Sit, Stay, Fetch'),
	( 2, 'Buddy','2018-12-10', 'Sit, Paw, Bark'),  
	( 2, 'Bella','2019-11-11', 'Sit, Stay, Roll'); 

-- Создаем таблицу hamster и заполняем данными
DROP TABLE IF EXISTS hamster;
CREATE TABLE hamster (       
	id INT AUTO_INCREMENT PRIMARY KEY, 
	pet_id INT, 
	hamster_name VARCHAR(25), 
	birthday DATE,
	command VARCHAR(45),
	FOREIGN KEY (pet_id) REFERENCES pet (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO 
	hamster (pet_id, hamster_name, birthday, command)
VALUES 
	( 3, 'Hammy','2021-03-10', 'Roll, Hide'),
	( 3, 'Peanut', '2021-08-01', 'Roll, Spin');

-- Создаем таблицу horse и заполняем данными
DROP TABLE IF EXISTS horse;  
CREATE TABLE horse (       
	id INT AUTO_INCREMENT PRIMARY KEY, 
	pack_animal_id INT, 
	horse_name VARCHAR(25), 
	birthday DATE,
	command VARCHAR(45),
	FOREIGN KEY (pack_animal_id) REFERENCES pack_animal (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO 
	horse (pack_animal_id, horse_name, birthday, command)
VALUES 
	(1, 'Thunder', '2015-07-21', 'Trot, Canter, Gallop'),
	(1, 'Storm', '2014-05-05', 'Trot, Canter'),  
	(1, 'Blaze', '2016-02-29', 'Trot, Jump, Gallop');

-- Создаем таблицу donkey и заполняем данными
DROP TABLE IF EXISTS donkey;
CREATE TABLE donkey (       
	id INT AUTO_INCREMENT PRIMARY KEY, 
	pack_animal_id INT, 
	donkey_name VARCHAR(25), 
	birthday DATE,
	command VARCHAR(45),
	FOREIGN KEY (pack_animal_id) REFERENCES pack_animal (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO 
	donkey (pack_animal_id, donkey_name, birthday, command)
VALUES 
	(2, 'Eeyore', '2017-09-18', 'Walk, Carry Load, Bray'), 
	(2, 'Burro', '2019-01-23', 'Walk, Bray, Kick');

-- Создаем таблицу camel и заполняем данными
DROP TABLE IF EXISTS camel;
CREATE TABLE camel (       
	id INT AUTO_INCREMENT PRIMARY KEY, 
	pack_animal_id INT, 
	camel_name VARCHAR(25), 
	birthday DATE,
	command VARCHAR(45),
	FOREIGN KEY (pack_animal_id) REFERENCES pack_animal (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO 
	camel (pack_animal_id, camel_name, birthday, command)
VALUES 
	(3, 'Sandy', '2016-11-03', 'Walk, Carry Load'),
	(3, 'Dune', '2018-12-12', 'Walk, Sit'), 
	(3, 'Sahara', '2015-08-14', 'Walk, Run');

-- Удалить записи о верблюдах и объединить таблицы лошадей и ослов.
DELETE FROM camel;

CREATE TABLE horse_and_donkey 
SELECT * FROM horse
	UNION 
SELECT * FROM donkey;

-- Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.
DROP TABLE IF EXISTS animal_1_3;
CREATE TABLE animal_1_3
SELECT
	cat_name AS name, birthday, command, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) AS age
FROM cat
UNION
SELECT
	dog_name AS name, birthday, command, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) AS age
FROM dog
UNION
SELECT
	hamster_name AS name, birthday, command, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) AS age
FROM hamster
UNION
SELECT
	horse_name AS name, birthday, command, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) AS age
FROM horse
UNION
SELECT
	horse_name AS name, birthday, command, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) AS age
FROM horse
UNION
SELECT
	donkey_name AS name, birthday, command, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) AS age
FROM donkey
UNION
SELECT
	camel_name AS name, birthday, command, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) AS age
FROM camel
WHERE birthday BETWEEN ADDDATE(CURDATE(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(), INTERVAL -1 YEAR);

-- Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.
DROP TABLE IF EXISTS all_animals;
CREATE TABLE all_animals
SELECT 
	c.cat_name,
	pe.pet_name, 
	c.birthday, 
	c.command,
	an.animal_name
FROM cat c
LEFT JOIN pet pe ON pe.id = c.pet_id
LEFT JOIN animal an ON an.id = pe.animal_id
UNION
SELECT 
	d.dog_name,
	pe.pet_name, 
	d.birthday, 
	d.command,
	an.animal_name
FROM dog d
LEFT JOIN pet pe ON pe.id = d.pet_id
LEFT JOIN animal an ON an.id = pe.animal_id
UNION
SELECT 
	h.hamster_name,
	pe.pet_name, 
	h.birthday, 
	h.command,
	an.animal_name
FROM hamster h
LEFT JOIN pet pe ON pe.id = h.pet_id
LEFT JOIN animal an ON an.id = pe.animal_id
UNION
SELECT 
	h.horse_name,
	pa.pack_animal_name, 
	h.birthday, 
	h.command,
	an.animal_name
FROM horse h
LEFT JOIN pack_animal pa ON pa.id = h.pack_animal_id
LEFT JOIN animal an ON an.id = pa.animal_id
UNION
SELECT 
	d.donkey_name,
	pa.pack_animal_name, 
	d.birthday, 
	d.command,
	an.animal_name
FROM donkey d
LEFT JOIN pack_animal pa ON pa.id = d.pack_animal_id
LEFT JOIN animal an ON an.id = pa.animal_id
UNION
SELECT 
	cl.camel_name,
	pa.pack_animal_name, 
	cl.birthday, 
	cl.command,
	an.animal_name
FROM camel cl
LEFT JOIN pack_animal pa ON pa.id = cl.pack_animal_id
LEFT JOIN animal an ON an.id = pa.animal_id
