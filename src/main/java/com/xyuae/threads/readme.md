# Thread Definition

- Runnables are objects that encapsulate code sequences
- Each thread executes a runnable object
- Threads can initiate an asynchronous task
- Asynchronous indicates that it can run concurrently
- Java supports threads through java.lang.Thread class and the java.lang.Runnable interface
- Java garbage collection runs on a daemon thread
- A daemon thread is created calling setDaemon
- New Thread -> start() -> runnable -> run() -> running -> wait() -> waiting -> elapsed time -> Dead