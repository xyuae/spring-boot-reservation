## Spring development with spring boot
- Data Access
- The Service Tier
    - Build a service abstraction
    - Develop a service object with Spring
- Web pages with Spring
    - Introduction to the controller
    - Thymeleaf as a rendering engine
    - Test
- Exposing our services through RESTful Endpoints

### Data Access
Spring data provides a common set of interfaces for a variety of data-sources and technologies
Not only do I have the traditional RDBMS datasources and all of its various flavors, but I also have all of the NoSQL database options, and Spring data's interface connect to both
in almost seamless integration.
Spring Data also provides a common method naming convention that allows me to swap those datasources behind the scenes almost effortlessly.
Spring Data also provides a common interface for the repository pattern and all of the data mapping abstractions that we normally have to deal with. 
### Service Tier
Now when we are dealing with separation of concerns one must always balance cleaner code versus too many class files. Indeed in this example application an argument could definitely be made
that the service abstraction yields less clean code.

However, I don't want to skip over the fact that often we need to expose our data in more 
than one way and a service abstraction really allows us to do that. Because let's be honest, in today's world of mobile 
computing and systems to systems computing and internet of things there's always more than one way that you need to expose your data to various services, applications, and whatnot . Another 
benefit of the service abstraction especially in the RDBMS world is it allows you to build complex transaction boundaries.

If we simply rely on the repositories themselves to be transactional boundaries which indeed they could be. We run the risk of 
having a commit to a single table that depends on the commit to another table that may have failed. By building a service abstraction with a transactional annotation we actually can push higher up teh layer where that rollback 
segment will actually occur. Again, much of this just comes from my experience but I find more often than not a service abstraction in your code benefits you.
### Web pages with Spring
MVC model contains thrree distinct points. The model, which is our data, the view, which is what the users sees or in the 
case of resful services what the system sees, and then the controller.

And that really is the piece that does all of the coordinating between them. So in Spring MVC the 
controller itself is the main abstraction point. And it has its own annotation, which is, as we might image, at controller. All of 
 the request respond through what is called the DispatcherServlet. And the DispatcherServlet is actually mapped to URLs through the request mapping annotation.
 
Each method is annotated with a request mapping. The DispatcherServlet uses that request mapping along with the HTTP verb to 
direct all traffic to a specific method. Once we get to that method, the method's responsibility then becomes building the model, resolving the view, whatever that view
might be, and passing it through either a template engine, ro through a marshaller to actually display content.
 

 ### RestController
 So much in teh same way that the standard at controller annotation works, the RestController provides the RequestMapping interface to the
 dispacher's servlet, which controls the URL to method mapping, and it proves a model to 'view' mapping. And I have view in quotes there because in reality,
 an XML body is just another type of view for an HTTP request.
 
 It's no different than an HTML body, except for that instead of displaying purely in a browser, it can be read by
 systems and other processes. Now, one of the biggest ways that it's different than the standard controller is it actually annotates every method 
 in the class by default with a response body, and what allows you to do is instead of just simply returning a string that gets mapped
 to a template, you can return an object, and that object is marshaled to either XML or JSON, which is the default behavior of a Spring boot application.
 
 You can then take the rest one step further with Spring HATEOAS, where you can actually add 
 hypermedia representations to your JSON body through the HAL language. Now you may ask yourself, why does this matter if we're building a web application?
 Your services may be consumed by a mobile application, and in the mobile world that we have today, all too often, people are forced to bulid a new set of systems to handle their 
 mobile needs,whereas if we are exposing our data services and our business services as web services, then 
 the mobile applications can consume them and they simply respond as the view engine.
 
It also help to build thin cloud server and client applications.

## Cloud-native application
### Micro-services
Microservices are based on a very similar design pattern called service-oriented architecture. And in this pattern, essentially
all of your data accesss and all of your business processes are accessed via services. Now, traditioanlly a services-oriented architecture was based on SOAP.
Whereas microservices are traditioanly based on REST.

Another distinct difference between services-oriented architecture and microservices are that in a microservices architecture, you're dealing with much more encapsulated domains. But there is still a key that 
evwryhting is very loosely coupled. Now with this encapsulation of domains, we still want to deal with a single domain per service. But that service has a very distinct purpose as well. 

Really with microservices, we're talking about decomposition of an appication and not just a component. Now, web applicaions in a microservices architecture, are treated themselves as distinct services. They should have an individual use and purpose.
So, going back to that housekeeping example, we might have an application that displays the current status of all of the rooms that are clean. 
