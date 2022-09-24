End points:
http://localhost:8080/say-hello-html
http://localhost:8080/say-hello-jsp
http://localhost:8080/login

# Understanding Loggin
# logging.level.some.path=debug
# logging.level.some.other.path=error
# logging.file.name=logfile.log

// private Logger logger = LoggerFactory.getLogger(this.getClass());
// logger.info("postConstruct");

// How MVC works in SpringBoot
B1: Identifies correct Controller method
/login => LoginController.gotoLoginPage

B2: Executes Controller method
=> Puts data into model
=> Returns view name => login

B3: Identifies correct View
/WEB-INF/jsp/login.jsp

B4: Executes view
