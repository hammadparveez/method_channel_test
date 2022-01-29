package com.example.method_channel_test
import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel
import kotlin.math.log


class MainActivity: FlutterActivity() {
    private val CHANNEL = "samples.flutter.dev/battery"

    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler {
            call, result ->
            println("Mason Brian is --------");
            println("Check ${call.method =="seyHi"}");
            seyHi();
            if(call.method =="seyHi") {
                println("seyHi  worked");
                result.success(seyHi());
            }else {
                println("seyHi didn't work");
                result.success("Something went wrong");

            }

            // Note: this method is invoked on the main thread.
            // TODO
        }
    }
    fun seyHi(): String {

        return "Hello Hammad";
    }

}
