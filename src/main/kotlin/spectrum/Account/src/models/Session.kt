public class Session {
    var name: String,
    var password: String

    // hashes the password and saves it in session
    fun StoreHashedPassowrd(password:String): Boolean {

    }

    // verifies if the password is correct
    fun VerifyPassword(password: String): Boolean{

    }
}

public class SessionStore {
    var sessions: List<Session>

    // returns a session depending on the username
    fun FindSession(name:String): Session {
        for (i in sessions) {
            if i.name == name {
                return i
            }
        }
    }
}