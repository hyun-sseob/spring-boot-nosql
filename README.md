# Spring boot로 사용하는 No sql 👋👋👋

> 아래 no sql DB들을 매우 가볍게 사용해봅니다 ⚡️  
> docker를 이용해 간단하게 아래 database를 설치하자 !
- Redis
```xml
$ docker run -p 6379:6379 --name redis_boot -d redis
$ docker exec -i -t redis_boot redis-cli
```

- MongoDb
```xml
$ docker run -p 27017:27017 --name mongo_boot -d mongo
$ docker exec -i -t mongo_boot bash
```

- Neo4j

