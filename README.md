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

# @ReapetedTest
1. This annotation use for run same test multiple times . 
2. it takes arguments in integer that is define how many tiem test case will execute
3. This annotation we are using insted of @Test anootation
4. passed arguments passed the with the method eg. method( RepetionInfo repetioninfo) . And we write some logic to execute method or we can use some predefine method

# Taging
1. @Tag : this annotain use for both class and method level. 
2. this annotain takes the arument tag name @Tag("Math"). 
3. We can run the selected tag 
4. we can configure in eclise IDE and as well MAVEN plugin firesure.
5. in the firesure plugin we can add configuration tag and configure

# TestInfo and TestRepoter
1. TestInfo : it is giving the information about the test case
2. TestRepoter :  it is also give the information about the test case but we can generate the report also 
3. both are interface
4. testReporter gives the time-stamp and more usefully details 