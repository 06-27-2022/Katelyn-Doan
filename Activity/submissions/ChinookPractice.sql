-- Questions 5 & 6
SELECT DISTINCT "BillingCountry" FROM "Invoice";
-- the result table should include the sale agent's first and last name
-- in customer there is support rep id "SupportRepId"
-- in the invoices there is "CustomerId"

SELECT "Employee"."LastName" , "Employee"."FirstName" FROM "Employee"
INNER JOIN "Customer" ON "Customer"."SupportRepId" = "Employee"."EmployeeId"
INNER JOIN "Invoice" ON "Invoice"."CustomerId" = "Customer"."CustomerId";
