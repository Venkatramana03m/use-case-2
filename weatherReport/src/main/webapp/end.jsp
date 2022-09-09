<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
                 <form action="addWeather">
                       <h4>Enter the data to Create a Record</h4>
                       <label for= "date">Date</label>
                       <input type = "text" name = "date"><br>
                       <label for= "lat">Latitude</label>
                       <input type ="number" name = "lat"><br>
    
                       <label for= "lon">Longitude</label>
                       <input type = "number" name= "lon"><br>
                      
                       <label for= "city">City</label>
                       <input type="text" name= "city"><br>
                     
                       <label for= "state">State</label>
                       <input type = "text" name= "state"><br>
                       
                       <label for= "temperature">TEMPERATURE</label>
                       <input type = "number" name = "temperature"><br>
                       <input type="submit"><br>
                 </form>
                 
                 <form action="searchId">
                          <h4>Enter ID to search</h4>
                          <input type = "number" name = "id"><br>
                          <input type = "submit"><br>
                 </form>
                 
                 <form action="deleteId">
                        <h4>Enter Id to Delete the Record</h4>
                        <input type="number" name = "id"><br>
                        <input type = "submit"><br>
                 </form>
</body>
</html>