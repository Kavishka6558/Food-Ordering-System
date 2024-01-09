<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="sign-login style.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <title>Signup</title>
</head>
<body>
    <div class="wrapper">
        <div class="container main">
            <div class="row">
            	<div class="col-md-6 side-image">
                </div>
                <div class="col-md-6 right">
                     <div class="input-box">
                        <form method='post' action="Signup-customer">
                        <header>Create account</header>

                        <div class="input-field">
                            <input type="text" class="input" id="name" name="name" required>
                            <label>Name</label>
                        </div>
                        
                        <div class="input-field">
                            <input type="text" class="input" id="pnumber" name="pnumber" required>
                            <label >Phone number</label>
                        </div>
                        
                        <div class="input-field">
                            <input type="email" class="input" id="email" name="email" required autocomplete="off">
                            <label>Email</label>
                        </div>

                        <div class="input-field">
                            <input type="password" class="input" id="password" name="password" required>
                            <label>Password</label>
                            </div>

                        <div class="input-field">
                            <input type="password" class="input" id="Cpassword" name="Cpassword" required>
                            <label>Confirm password</label>
                            </div>

                        <div class="input-field">
                            <input type="submit" class="submit" value="Sign Up">
                        </div>
                        
                        <div class="signin">
                        <span>Already have an account? <a href="FOS_login.jsp">Log in here</a></span>
                        </div>
                    </form>
                     </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>