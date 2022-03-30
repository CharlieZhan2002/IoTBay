<!DOCTYPE html>
<html>
<head>
	<title>Eva Simon: Designer Extraordinaire</title>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/reset.css">
	<link href='http://fonts.googleapis.com/css?family=Titillium+Web:300,400' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Teko:300,400' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="css/main.css">
</head>

<body>
	<main>
		<header>
			<img src="img/logo.jpg">
                        <div></div>
		</header>
		<div class="content">
			<section>
				<header>
					<h1 align="center">IoTbay</h1>
					<h2 align="center">Welcome! 
                                            <%
                                                String useremail =  request.getParameter("email");
                                            %><%= useremail %></h2>
				</header>
				<p>
					IoTBay has a wide range collection of devices and sensors (Refer to IoT websites to acquire devices and sensors listings. I.E: https://tutorials-raspberrypi.com/raspberry-pi-sensors-overview-50-important-components/). IoTBay sells these devices in their Sydney store to their customers. IoTBay aims to improve their business portfolio and provides customers with the option of purchasing the IoT devices online. There is a wide range of online stores nowadays selling similar IoT devices; therefore the IoTBay aims to purchase a competitive web application that provides user-friendly and effective interface to customers.
				</p>
			</section>
			<aside>
				<h3 align="center">Want to view products?</h3>
				<p ></p>

				<ul>
					<li>
						<a href="window.location.href='../MainPage/main.jsp'" target="_blank"><h2  align="center">Begin</h2></a>
						<article>
							<p>Please follow us</p>
							<time datetime="2022-03-31">1 Hour ago</time>
						</article>
					</li>
					<li>
						<h4 class="facebook">Facebook</h4>
					</li>
					<li>
						<h4 class="linkedin">LinkedIn</h4>
					</li>
				</ul>
			</aside>
			<footer>
				<p class="copyright">&copy; 2022 IoTbay Productions.</p>
			</footer>
		</div>
	</main>
</body>

</html>








