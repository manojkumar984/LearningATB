

---

## 🧪 **Test Cases for `IsValidISBN10` SOAP API**

*Complete list covering valid, invalid, edge cases, protocol tests, and security tests.*

| TID   | Test Data                   | Test Case Description       | Precondition      | Test Steps                  | Expected Result      | Priority |
| ----- | --------------------------- | --------------------------- | ----------------- | --------------------------- | -------------------- | -------- |
| TC001 | `0306406152`                | Valid ISBN-10 (digits only) | API is accessible | Send POST with `0306406152` | `true`               | High     |
| TC002 | `048665088X`                | Valid ISBN-10 (ends in X)   | API is accessible | Send POST with `048665088X` | `true`               | High     |
| TC003 | `0306406153`                | Invalid checksum ISBN       | API is accessible | Send `0306406153`           | `false`              | High     |
| TC004 | `123456789`                 | Less than 10 digits         | API is accessible | Send 9-digit ISBN           | `false`              | Medium   |
| TC005 | `1234567890123`             | More than 10 digits         | API is accessible | Send 13-digit ISBN          | `false`              | Medium   |
| TC006 | `abcdefghij`                | Alphabetic characters       | API is accessible | Send a-z string             | `false`              | Medium   |
| TC007 | `12345!@#X*`                | Special characters          | API is accessible | Send symbols                | `false`              | Medium   |
| TC008 | `""`                        | Empty string                | API is accessible | Send empty string           | `false` or error     | High     |
| TC009 | `null`                      | Null input                  | API is accessible | Send null in body           | `false` or error     | High     |
| TC010 | *(missing)*                 | Missing `sISBN` field       | API is accessible | Omit `<sISBN>`              | Error or fault       | High     |
| TC011 | `١٢٣٤٥٦٧٨٩٠`                | Arabic numerals             | API is accessible | Send Arabic digits          | `false`              | Medium   |
| TC012 | `一二三四五六七八九十`                | Chinese numerals            | API is accessible | Send Chinese characters     | `false`              | Medium   |
| TC013 | `1234567X89`                | Misplaced 'X' in ISBN       | API is accessible | Send X in middle            | `false`              | Medium   |
| TC014 | `💯📚📖🧠`                  | Emojis in ISBN              | API is accessible | Send emojis                 | `false`              | Low      |
| TC015 | `ABC1234567`                | Alphanumeric ISBN           | API is accessible | Send mixed letters/numbers  | `false`              | Medium   |
| TC016 | —                           | Missing Content-Type header | API is accessible | Send without headers        | `415` or error       | High     |
| TC017 | —                           | Invalid Content-Type header | API is accessible | Use `text/plain`            | `415` or error       | High     |
| TC018 | —                           | Malformed SOAP body         | API is accessible | Send broken XML             | SOAP Fault           | High     |
| TC019 | —                           | No headers at all           | API is accessible | Send raw request            | `400` or error       | High     |
| TC020 | —                           | Incorrect SOAP namespace    | API is accessible | Change xmlns URI            | Error or fault       | Medium   |
| TC021 | —                           | Wrong HTTP method (GET)     | API is accessible | Use GET instead of POST     | `405`                | Medium   |
| TC022 | `0000000000`                | All-zero ISBN               | API is accessible | Send all zeros              | `false`              | Low      |
| TC023 | `999999999X`                | Upper boundary with X       | API is accessible | Send 9s + X                 | Depends on checksum  | Medium   |
| TC024 | `000000000X`                | Lower boundary with X       | API is accessible | Send 0s + X                 | Depends on checksum  | Medium   |
| TC025 | `0471958697`                | Known valid ISBN            | API is accessible | Send book ISBN              | `true`               | High     |
| TC026 | `invalid#isbn@10`           | Alphanumeric & symbols      | API is accessible | Send mix of letters/symbols | `false`              | Low      |
| TC027 | `<script>alert(1)</script>` | XSS test input              | API is accessible | Try script injection        | `false` or sanitized | High     |
| TC028 | `"; DROP TABLE; --`         | SQL injection test          | API is accessible | Try SQL payload             | `false` or sanitized | High     |

---

