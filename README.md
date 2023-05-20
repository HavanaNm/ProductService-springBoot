Project - ProductService-springBoot

Author - Bashitha Reddy Pullalarevu 

I have developed a Java microservices project called ProductService using the Spring Boot framework. The primary objective of this project is to efficiently handle API requests for placing orders, providing a seamless and reliable experience for users.

I have developed three components, namely ProductService, OrderService, and ServiceRegistry, using the Spring Framework.

I have implemented separate APIs for different functionalities: for example adding a product using the ProductService component and placing an order using the OrderService component. 

In this project, the Service Registry (Eureka Server) is utilized to facilitate the connection between the ProductService and OrderService components. 

I have used Feign Client acts as a client-side HTTP client and allows the ProductService to make requests to the OrderService API. By employing Feign Client and integrating it with the Spring Framework, I have established a seamless interaction between the ProductService and OrderService, enabling the necessary API calls to handle product quantity reduction effectively.

I have verified the functionality of these APIs by testing them with Postman, ensuring that they respond correctly. To persist the data, I have integrated a MySQL database into the project. The database stores the necessary information related to products and orders, allowing for efficient data management and retrieval.
