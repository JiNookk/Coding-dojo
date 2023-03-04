SELECT BOOK_ID, AUTHOR_NAME, date_format(published_date, '%Y-%m-%d') as PUBLISH_DATE from book
inner join author on book.author_id = author.author_id
where book.category = '경제'
order by PUBLISH_DATE asc