package main.kotlin.core.src

import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket
import java.net.URISyntaxException

// get the socket URL

class SocketInstance : Application() {
    // socket.io connection url
    private var mSocket: Socket? = null

    override fun onCreate() {
        super.onCreate()
        try {
            // creating socket instance
            mSocket = IO.socket(URL)
        } catch (e: java.net.URISyntaxException) {
            throw RuntimeException(e)
        }
    }

}