# J2EE Valorization Web Application

## Overview

This J2EE project is a web application designed for valorization, calculating the total value of different products based on their type, quantity, and price. The application consists of two servlets: `valorisation` and `calval`.

## `valorisation` Servlet

- Presents a user-friendly form for inputting product details like product code, type, quantity, and price.
- Displays three types of valorization values (`val1`, `val2`, `val3`) on the HTML page.
- Users can submit the form to the `calval` servlet by clicking either the "Next" or "Global" button.

## `calval` Servlet

- Handles form submissions from the `valorisation` servlet.
- If the user clicks "Next," it calculates the valorization for the current input and updates the corresponding type (`val1`, `val2`, or `val3`).
- If the user clicks "Global," it calculates the total global valorization (`cal`) by summing up the values of `val1`, `val2`, and `val3`.
- Displays the global valorization on a separate HTML page.
