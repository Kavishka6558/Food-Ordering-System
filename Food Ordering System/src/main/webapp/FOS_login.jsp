<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="sign-login style.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <title>Login</title>
</head>
<body>
    <div class="wrapper">
        <div class="container main">
            <div class="row">
                <div class="col-md-6 side-image">
                    <img src="white.jpg" alt="">
                </div>
                <div class="col-md-6 right">
                     <div class="input-box">
                        <header>Login account</header>
                         <form method='post' action="Login-customer">
                        <div class="input-field">
                            <input type="email" class="input" id="log_email" name="log_email" required>
                            <label>E-mail</label>
                        </div>
                        <div class="input-field">
                            <input type="password" class="input" id="log_password" name="log_password" required>
                            <label>Password</label>
                            </div>
                        <div class="input-field">
                            <input type="submit" class="submit" value="Sign Up">
                        </div>
                        <div class="signin">
                        <span>Don't have an account? <a href="FOS_signup.jsp">Sign up here</a></span>
                        </div>
                    </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>