
 function confirmLogout() {
            var confirmLogout = confirm("Are you sure you want to log out?");
            if (confirmLogout) {
                window.location.href = "index.jsp"; // Replace "logout.jsp" with your actual logout URL
            }
        }
