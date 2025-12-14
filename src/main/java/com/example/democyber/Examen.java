package com.example.democyber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Examen {

    public static void main(String[] args) {
        SpringApplication.run(Examen.class, args);
    }

    @GetMapping("/")
    public String loginPage() {
        return """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Login Page</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    background: #f4f6f8;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    height: 100vh;
                }
                .login-box {
                    background: white;
                    padding: 25px;
                    border-radius: 8px;
                    box-shadow: 0 0 10px rgba(0,0,0,0.1);
                    width: 300px;
                }
                h2 {
                    text-align: center;
                }
                input {
                    width: 100%;
                    padding: 10px;
                    margin: 10px 0;
                }
                button {
                    width: 100%;
                    padding: 10px;
                    background: #007bff;
                    border: none;
                    color: white;
                    font-size: 16px;
                    cursor: pointer;
                }
                .msg {
                    text-align: center;
                    margin-top: 10px;
                    color: green;
                    display: none;
                }
            </style>
        </head>
        <body>
            <div class="login-box">
                <h2>Demo Login</h2>
                <input type="text" placeholder="Username">
                <input type="password" placeholder="Password">
                <button onclick="login()">Login</button>
                <div class="msg" id="msg">Login successful (demo)</div>
            </div>

            <script>
                function login() {
                    document.getElementById("msg").style.display = "block";
                }
            </script>
        </body>
        </html>
        """;
    }
}
