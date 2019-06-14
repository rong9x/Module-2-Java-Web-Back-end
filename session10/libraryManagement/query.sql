select book.bookName, category.type
from book
inner join category
on book.Category_idCategory = category.idCategory
where category.type = 'Technology';

SELECT book.bookName, borroworder.status, borroworder.loanDay, borroworder.payDay
FROM borroworder
inner join book
on borroworder.Book_idBook = book.idBook
where borroworder.status = 'borrowed';

SELECT * FROM student where status = 'in debt';