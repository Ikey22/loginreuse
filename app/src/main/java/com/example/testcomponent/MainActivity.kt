package com.example.testcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val loginUIComponent = com.example.logincomponentlibrary.LoginUIComponent(this)
//        // Add the loginComponent to your layout
//        val linearLayout: LinearLayout = findViewById(R.id.linearLayout) // Replace with your actual layout
//        linearLayout.addView(loginUIComponent)
//
//        loginUIComponent.setLoginClickListener {
//            val animation = AnimationUtils.loadAnimation(this, R.anim.button_click_animation)
//            //loginComponent.startAnimation(animation)
//            if(loginUIComponent.validateInputs()) {
//                return@setLoginClickListener
//            }
//
//            var username = loginUIComponent.getUsername()
//            var password = loginUIComponent.getPassword()
//
//            Toast.makeText(this, "$username", Toast.LENGTH_SHORT).show()
//        }



    }
}