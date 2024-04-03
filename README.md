## Итоговая контрольная работа ##


### Информация о проекте ###
Необходимо организовать систему учета для питомника в котором живут 
домашние и Pack animals.


### Как сдавать проект ### 
Для сдачи проекта необходимо создать отдельный общедоступный репозиторий(Github, 
gitlub, или Bitbucket). Разработку вести в этом репозитории, использовать 
пул реквесты на изменения. Программа должна запускаться и работать, 
ошибок при выполнении программы быть не должно. 
Программа, может использоваться в различных системах, поэтому необходимо 
разработать класс в виде конструктора



# Задание #

## Операционные системы и виртуализация (Linux) ##

**1. Использование команды cat в Linux**
    
- Создать два текстовых файла: "Pets"(Домашние животные) и "Pack animals"(вьючные животные), используя команду `cat` в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором — лошадей, верблюдов и ослов.
- Объединить содержимое этих двух файлов в один и просмотреть его содержимое.
- Переименовать получившийся файл в "Human Friends"(.
Пример конечного вывода после команды “ls” :
Desktop Documents Downloads  HumanFriends.txt  Music  PackAnimals.txt  Pets.txt  Pictures  Videos

- Создаем файл Pets.txt и записываем в него Домашние животные (собаки, кошки и хомяки)
```
$ cat > Pets.txt
Fido
Whiskers
Hammy
Buddy
mudge
Peanut
Bella
Oliver
```
<u> Завершаем ввод командой Ctrl + D </u>

- Просмотр содержимого файла Pets.txt
```
$ cat Pets.txt
```
- Создаем файл PackAnimals.txt и записываем в него Вьючные животные (лошадей, верблюдов и ослов)
```  
$ cat > PackAnimals.txt
```
- Объединяем созданные файлы Pets.txt и PackAnimals.txt в один файл HumanFriends.txt
```  
$ cat Pets.txt PackAnimals.txt > HumanFriends.txt
```
- Чтение файлов
```
$ ls
app.py                nginx-conf        test2            Изображения
del_backupfiles.sh    PackAnimals.txt   test_lxc_1.log   Музыка
dir1                  Pets.txt          test.yaml        Общедоступные
docker-compose.yaml   script1.sh        wordpress       'Рабочий стол'
Dockerfile            sem3              Видео            Шаблоны
gb                    shared            Документы
HumanFriends.txt      snap              Загрузки
```

**2. Работа с директориями в Linux**
    
- Создать новую директорию и переместить туда файл "Human Friends".

- создаем новый каталог ItogKR
```
$ mkdir ItogKR
```
- перемещаем в каталог ItogKR файл HumanFriends.txt
```
$ mv HumanFriends.txt ItogKR/
```
- чтение каталога ItogKR
```
$ ls ItogKR/
HumanFriends.txt
```
**3. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину”**
- Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.
- 
- Установка MySQL
```
$ sudo apt update
$ sudo apt install mysql-server-8.0.36
```
- Проверка установки
```
$ sudo systemctl status mysql
● mysql.service - MySQL Community Server
     Loaded: loaded (/lib/systemd/system/mysql.service; enabled; vendor preset:>
     Active: active (running) since Tue 2024-04-02 09:15:59 MSK; 49min ago
   Main PID: 1538 (mysqld)
     Status: "Server is operational"
      Tasks: 37 (limit: 2261)
     Memory: 5.3M
        CPU: 13.926s
     CGroup: /system.slice/mysql.service
             └─1538 /usr/sbin/mysqld

апр 02 09:15:25 db-linux systemd[1]: Starting MySQL Community Server...
апр 02 09:15:59 db-linux systemd[1]: Started MySQL Community Server.
```
- Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.
```

```

**4. Управление deb-пакетами**
Установить и затем удалить deb-пакет, используя команду `dpkg`.
  
- скачиваем virtualbox
```
$ wget https://download.virtualbox.org/virtualbox/7.0.14/virtualbox-7.0_7.0.14-161095~Ubuntu~jammy_amd64.deb
```
- установка virtualbox
```
$ dpkg -i virtualbox-7.0_7.0.6-155176Ubuntujammy_amd64.deb
```
- удаление virtualbox
```
$ dpkg -P virtualbox-7.0
```
**5. История команд в терминале Ubuntu.**

Сохранить и выложить историю ваших терминальных команд в Ubuntu.
В формате: Файла с ФИО, датой сдачи, номером группы(или потока)

- Сохраняем историю команд в файл
```
$ history > Agadadashev_Aslan_A_05_04_2024.txt
```