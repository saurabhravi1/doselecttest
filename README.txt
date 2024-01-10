API Documentation  : http://localhost:8080/FizzBuzzServer/swagger-ui/index.html
API Specification : http://localhost:8080/FizzBuzzServer/v3/api-docs
List of dependencies used:
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId><!--Used for enabling spring framework-->
		</dependency>
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId><!--Used for enabling swagger UI for api specification/documentation-->
			<version>2.3.0</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId> <!--Used for enabling spring tests--> 
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId><!--Used for enabling autorun of project so that server restart not required in case of any changes in code while development-->
			<scope>runtime</scope>
			<optional>true</optional>
</dependency>
