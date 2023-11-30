package com.example.logincomponentlibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class LoginUIComponent @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr:Int = 0): LinearLayout(context, attrs, defStyleAttr) {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var confirmPasswordEditText: EditText  // New EditText for confirmation

    init {
        initView()
    }

    private fun initView() {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.login_ui_component, this, true)

        // Initialize UI components
        usernameEditText = findViewById(R.id.editTextUsername)
        passwordEditText = findViewById(R.id.editTextPassword)
        confirmPasswordEditText = findViewById(R.id.editTextConfirmPassword)  // Initialize the new EditText
        loginButton = findViewById(R.id.buttonLogin)
    }

    // Add any helper methods or customizations here

    fun getUsername(): String {
        return usernameEditText.text.toString()
    }

    fun getPassword(): String {
        return passwordEditText.text.toString()
    }

    fun setLoginClickListener(listener: OnClickListener) {
        loginButton.setOnClickListener(listener)
    }

    fun getConfirmPassword(): String {
        return confirmPasswordEditText.text.toString()
    }

    fun validateInputs(): Boolean {
        val username = getUsername()
        val password = getPassword()
        val confirmPassword = getConfirmPassword()

        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(context, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            return false
        }

        if (password != confirmPassword) {
            Toast.makeText(context, "Passwords do not match", Toast.LENGTH_SHORT).show()
            return false
        }

        // Add any additional validation logic as needed

        return true
    }
}