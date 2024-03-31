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
