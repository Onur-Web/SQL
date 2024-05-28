
1.Test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

CREATE TABLE employee (
        id SERIAL PRIMARY KEY,
        name VARCHAR(50),
        birthday DATE,
        email VARCHAR(100));

2.Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

INSERT INTO employee (name, birthday, email) VALUES
        ('Alecia', '1914-05-30', 'acolerick0@example.com'),
        ('Opalina', '2020-05-31', 'ogetch2@example.com'),
        ('Justis', '2012-01-16', 'jdressel4@example.com');
        ...+47

3.Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

UPDATE employee SET name = 'XXX' WHERE id = 1;
UPDATE employee SET birthday = '2024.05.27' WHERE id = 2;
UPDATE employee SET name = 'ZZZ' WHERE id = 3;
UPDATE employee SET birthday = '2024.04.24' WHERE id = 4;
UPDATE employee SET name = 'YYY' WHERE id = 5;

4.Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

DELETE FROM employee WHERE id = 1;
DELETE FROM employee WHERE birthday = '1914-05-30';
DELETE FROM employee WHERE id = 2;
DELETE FROM employee WHERE birthday = '1986-03-15';
DELETE FROM employee WHERE id = 3;
