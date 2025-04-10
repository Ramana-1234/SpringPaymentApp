<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Bank Account Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
    <div class="header">
        <h1>Add Bank Account</h1>
    </div>
    <div class="container">
        <div class="form-container">
            <h2>Enter Bank Details</h2>
            <form action="/addBank" method="Post">
    
                <div class="form-group mb-3">
                    <label for="accountNumber">Account Number:</label>
                    <input type="number" id="accountNumber" name="accountNumber" class="form-control" required>
                </div>
             
                <div class="form-group mb-3">
                    <label for="ifscCode">IFSC Code:</label>
                    <input type="text" id="ifscCode" name="ifscCode" class="form-control" required>
                </div>
                <div class="form-group mb-3">
                    <label for="bankName">Bank Name:</label>
                    <input type="text" id="bankName" name="bankName" class="form-control" required>
                </div>
                <div class="form-group mb-3">
                    <label for="bankAccountBranchLocation">Bank Account Branch Location:</label>
                    <input type="text" id="bankAccountBranchLocation" name="bankAccountBranchLocation" class="form-control" required>
                </div>
                
                  <div class="form-group mb-3">
                    <label for="isActive">is Active:</label>
                    <input type="text" id="isActive" name="isActive" class="form-control" required>
                </div>
                
                <button type="submit" class="btn-primary">Add Account</button>
            </form>
        </div>
    </div>
</body>
</html>