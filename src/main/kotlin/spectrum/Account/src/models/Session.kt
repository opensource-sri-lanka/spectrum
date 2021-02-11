public class Session {
    var name: String = ""
    var password: String = ""
    var id: Int = 0

    // hashes the password and saves it in session
    fun StoreHashedPassowrd(password:String): Boolean {
        return true
    }

    // verifies if the password is correct
    fun VerifyPassword(password: String): Boolean{
        return true
    }
}

public class SessionStore {
    var sessions: List<Session>

    // returns a session depending on the username
    fun FindSession(name:String): Session? {
        for (i in sessions) {
            if (i.name == name) {
                return i
            }
        }
        return null
    }

    // returns a session depending on the id
    fun FindSession(id:Int): Session? {
        for (i in sessions) {
            if (i.id == id) {
                return i
            }
        }
        return null
    }
}