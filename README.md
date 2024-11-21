rder Inventory Project Overview
⏰ Welcome to the documentation for of Order Inventory project! This initiative stems from
the need for a streamlined and efficient system to manage and track orders, inventory,
and related processes. The primary purpose of the Order Inventory system is to enhance
the overall order management experience, providing users with a centralized platform to
optimize inventory control and improve order fulfillment processes.
Project Scope
Features and Functionalities:
1. Order Management:
Creation of new orders.
Real-time tracking of order status.
Order history and tracking.
2. Inventory Management:
Comprehensive database of inventory items.
Stock level updates and monitoring.
Integration with order management for seamless updates.
Database schema:
ER Diagram
Order
Inventory
Project
Overview
Project
Scope
Relationships: Data
Validation
Rules:
REST
API
Design:
Http
Status
Code:
Working
with
GitHub:
Endpoints
Order Inventory 2
https://prod-files-secure.s3.us-west-2.amazonaws.com/31282dbc-a6a3-454c-930fbedcf45363ec/0df30a00-1748-4940-8c7f-91e12cac4eb4/diag.pdf
MySQL script files
script_one.sql
script_two.sql
Relationships:
1. Order-Customer Relationship:
Each order is associated with a customer through the CustomerID foreign key in the Orders
table.
2. Order-InventoryItem Relationship:
The OrderDetails table links orders to the items included in each order, using the OrderID
and ItemID.
Data Validation Rules:
1. Order Status Validation:
OrderStatus in the Orders table is restricted to predefined values (e.g., "Pending,"
"Processing," "Shipped," "Delivered") to maintain consistency.
2. Stock Quantity Validation:
StockQuantity in the InventoryItems table must be a non-negative integer to ensure
accurate representation of available stock.
3. Customer Email Format Validation:
The Email attribute in the Customers table is validated against a standard email format to
ensure the correctness of customer email addresses.
4. Foreign Key Constraints:
Foreign key constraints are applied to ensure referential integrity. For example, the
CustomerID in the Orders table must match a valid CustomerID in the Customers table.
REST API Design:
All REST API requests and responses follow the JSON format. The project employs standard HTTP
status codes (200, 201, 400, 404, 401, 500, 505) appropriately in response objects to convey the
outcome of API requests
Http Status Code:
HTTP Status Code Error Response
Order Inventory 3
400 Bad Request
401 Unauthorized
404 Not Found
500 Internal Server Error
505 HTTP Version Not Supported
Working with GitHub:
Create a New Repository on GitHub:
Log in to your GitHub account.
Click on the "+" icon in the top right corner and select "New repository."
Provide a name, description, and other relevant details.
Fork the Repository:
Go to the GitHub page of the repository you want to contribute to.
Click on the "Fork" button in the upper right corner of the page.
Clone Your Forked Repository:
Clone your forked repository to your local machine.
git clone https://github.com/your-username/repository.git
Make Changes, Commit, and Push:
Make the necessary changes to the code.
Stage and commit your changes.
git add .
git commit -m "Your descriptive commit message"
git push
Create a Pull Request:
Go to the GitHub page of your forked repository.
Switch to the branch you just pushed.
Click on the "New Pull Request" button.
Review and Merge:
Describe your changes and submit the pull request.
The repository owner or maintainers will review your changes.
Update Your Fork (Optional):
