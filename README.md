## Задача:

Сделать 3 запроса:

1) ***отправить картинку на сервер в JSON***:

- описание картинки, например "пейзаж"
- сама картинка в формате base64

Сервер должен вернуть ID картинки и сохранить в базу. В оперативной памяти не храним.

#### Пример:
По адресу http://164.68.101.149:12345/KvadeArtur/addimage.html передаем данные
- Image in Base64
- Name Image

Получаем:

`Image posted ID = 2`

2) ***получить список всех картинок в формате json, без самих картинок, только описание и id***

#### Пример:
Делаем запрос на адрес http://164.68.101.149:12345/KvadeArtur/api

Получаем:

`[{
  "id": 4,
  "nameImage": "frankfurt"
}, {
  "id": 5,
  "nameImage": "earth"
}, {
  "id": 6,
  "nameImage": "nature"
}, {
  "id": 7,
  "nameImage": "space"
}]`

3) ***получить картинку по id по прямой ссылке***

#### Пример:
Делаем запрос на адрес http://164.68.101.149:12345/KvadeArtur/api/5

Получаем:

![earth](https://scx1.b-cdn.net/csz/news/800/2019/earth.jpg)
