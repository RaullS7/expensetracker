
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Expenses</title>
	<link rel="stylesheet" href="css/incomeexpense.css">
	<%@include file="SideBar.jsp" %>
	
</head>
<body>
    <div class="container">
        
        <header>Add new </header>
        <form action="#">
            <div class="form first">
                <div class="details personal"><br>
                    <div class="fields">
                        <div class="input-field">
                            <label>Type</label><br>
                            <select required>
                              <option>Income</option>
                              <option>Expense</option>
                            </select>
                        </div>
                        <div class="input-field">
                            <label>Account</label><br>
                            <select required>
                                <option >Card</option>
                                <option>Cash</option>
                            </select>
                        </div>
                        <div class="input-field">
                            <label>Category</label><br>
                            <select required>
                                <c:forEach var="value" items="${name}">
                               <option value="${value}">${value}</option>
                               </c:forEach>
                            </select>
                        </div>
                        <div class="input-field">
                            <label>Amount</label><br>
                            <input type="text" id="amount" name="amount" required="required">
                        </div>
                         <div class="input-field">
                            <label>Date</label><br>
                            <input type="date"  required>
                        </div>
                        <div class="input-field">
                            <label>Time</label><br>
                            <input type="time" required>
                        </div>
                        <div class="input-field">
                            <label>Note:</label><br>
                            <textarea id="description" name="description" rows="2" cols="50"></textarea>
                        </div>
                    </div>
                    <div>
                        <button class="submit">
                            <span class="btnText">Submit</span>
                            <i class="uil uil-navigator"></i>
                        </button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
