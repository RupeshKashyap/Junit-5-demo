# Junit-5-demo
Basic Junit5 project
# Run in Windows
1. Spring Boot application 
2. Run in cmd  : spring-boot:run
3. or you can use any IDE(Eclise,IntelliJ)
# Dependencies 
1. Jupitor Enggine
2. Jupitor API
3. Sure Fire 

# Importent point 
1. for evey  test case junit-5 crete new instacce so don't create class member valiabe and avoid the order of taes case execution
2. Test Life cycle : - lifecucle hooks 
	a. @BeforeAll :- Executing before any thing will execute, before even class instacce created , that means we can call only static method (Note it will work  if you are creatig only single instace for the class )
	b. @AfterAll :- method will call after the last test case
	c. @BeforeEach :- method will ececute before ececute every test cases
	d. @AfterEach :- method will ececute after ececute every test cases
3. @TestInstance(TestInstance.Lifecycle.PER_CLASS)	:- create only one instacce per class (changing default instance behavior 

# Annotation to scal you test 
1. for large scal test cases
2. @DisplayName :- we can change test case nam or description for the test case
3. @Disabled :- test scope will skip this test when test case is annotated with @Disabled it will not give any test failer . 

# Conditional Executon
1. @EnabledOnOs(OS.LINUX) : test case will run only for particular OS otherwise test case will disabled 
2. @EnabledOnJre(JRE.JAVA_11)
3. @EnabledIf
4. @EnabledIfSystemProperty
5. @EnabledIfEnvironmentVariable

# Assumption 
1. assumeTrue(true) for asumimg something like server is server is up(based on the assumption it will execute , if assumption is false simple it will not execute the next line).

#Nested Test Case 
1. @Nested : this annotation use in inner class level , @nested group together which in inside the inner class and run as a one test case and all nested cases are sub test for the class

# AssetAll (new in junit -5 )
1. @AssetAll :-  it the the annotation defien than bunch of test case can excetute at a time and if any of those fail mark as a fail 