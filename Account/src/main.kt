import com.github.nkzawa.emitter.Emitter
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket

val socket = IO.socket("http://localhost:/8080")

socket.on(Socket.EVENT_CONNECT, Emitter.Listener {
    socket.emit("messages", "hi")
});