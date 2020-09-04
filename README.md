# Spring Cloud OpenFeign Sample

## Try it
Consumer
```sh:
$ cd consumer
$ ./mvnw clean spring-boot:run
```

Producer
```sh
$ cd producer
$ ./mvnw clean spring-boot:run
```

```sh
$ curl -v http://localhost:8080/api/sakes | jq .
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 8080 (#0)
> GET /api/sakes HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.54.0
> Accept: */*
> 
< HTTP/1.1 200 
< Content-Type: application/json
< Transfer-Encoding: chunked
< Date: Fri, 04 Sep 2020 04:12:38 GMT
< 
{ [172 bytes data]
100   166    0   166    0     0  14628      0 --:--:-- --:--:-- --:--:-- 15090
* Connection #0 to host localhost left intact
[
  {
    "id": 1,
    "name": "若波",
    "brewingName": "若波酒造"
  },
  {
    "id": 2,
    "name": "新政",
    "brewingName": "新政酒造"
  },
  {
    "id": 3,
    "name": "十四代",
    "brewingName": "高木酒造"
  }
]
```


## Guide
[Spring Cloud OpenFeing Official Document](https://docs.spring.io/spring-cloud-openfeign/docs/2.2.5.RELEASE/reference/html/)
