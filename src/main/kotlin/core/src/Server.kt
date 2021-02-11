class Server(uconfig: ServerConfig) {
    var config

    init {
        config = uconfig
    }

    fun hello(args: Array<String>) {
        print("Hello what's your good name? ")

        val enteredString = readLine()
        printLn("What would you like to do today $enteredString:" +
                "1) Create new Chat Session (1)" +
                "2) Join existing Chat Session (2)")
    }





}