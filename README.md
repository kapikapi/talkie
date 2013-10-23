talkie
======

Small sample project for students

Задание:
1. Создать проект, используя предложенные файлы с исходным кодом, и "собрать" его, используя Ant. 
   Запустить - убедиться, что собранный jar работает.
2. Создать второй проект с теми же исходными кодами, но который будет собираться с помощью Maven. 
   Лучше всего изначально создавать проект, используя Maven archetype plugin. Тогда структура проекта будет соответствовать стандартной. 
   Дальше нужно осуществить сборку с помощью Maven и, как и в прошлом примере, убедиться, что собранный jar работает.
   Получившийся проект закоммитить в свой репозиторий на github. Коммитить стоит начиная с папки src, т.к. при клонировании репозитория    по умолчанию создается папка с его именем и туда кладется все содержимое репозитория. Коммитить "рабочие" папки типа target или файлы/папки настроек для IDE не нужно.
3. Во втором проекте сделать следующие изменения (с соответсвующими изменениями в pom.xml, если это нужно):
    - добавить использование ресурсов (например, сделать, чтобы ответы хранились в файле и зачитывать его при старте. Файл должен находиться внутри проекта)
    - добавить использование внешней библиотеки (например, использовать StringUtils.isEmpty(String str) из библиотеки apache commons (groupId: commons-lang; artifactId: commons-lang)
   Все внесенные изменения тоже закоммитить в репозиторий.

Презентацию положу на Wiki здесь же.