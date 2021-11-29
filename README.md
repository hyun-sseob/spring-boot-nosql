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
```xml
-- mac book m1칩을 사용하는 경우 --platform linux/amd64 옵션이 추가되어야 합니다. 
$ docker run -p 7474:7474 -p 7687:7687 -d --name neo4j_boot --platform linux/amd64 neo4j
- 접속: http://localhost:7474/browser/
```

