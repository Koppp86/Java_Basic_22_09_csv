-- -------------------------------
-- Создание новой БД
-- -------------------------------
create database Template;

/*Не стоит хранить question_id в таблице с ответами - это нарушает нормализацию.
  Лучше добавить таблицу со связями:
  Таблица Answers:
  id SERIAL PRIMARY KEY,
  answer VARCHAR(100) NOT NULL UNIQUE

  Таблица Question_to_answer:
  question_id
  answer _id

  Т.е. реализуем связь многие-ко-многим. У одного вопроса может быть несколько ответов и один ответ может быть у нескольких разных вопросов.*/

-- -------------------------------
-- 1) Вопросы
-- -------------------------------
create table questions
(
	question_id serial 		 primary key,
	question_nn	integer,
	question	varchar(100) not null unique
);

insert into questions(question_nn, question)
values
	(1, 'Сколько минут в часе?'),
	(2, 'Сколько часов в сутках?'),
	(3, 'Сколько месяцев в году?');

select question_id, question_nn, question
from questions
order by question_nn;

-- -------------------------------
-- 2) Ответы
-- -------------------------------
create table answers
(
	answer_id 	serial 		 primary key,
	answer		varchar(100) not null unique
);

insert into answers(question_id, answer)
values
	('60'),
	('100'),
	('50'),
	('12'),
	('24'),
	('36'),
	('48'),
	('10'),
	('11'),
	('13'),
	('15');

select answer_id, answer
from answers
order by answer_id;

-- -------------------------------
-- 3) Ответы на Вопросы
-- -------------------------------
create table question_to_answer
(
	question_id integer references questions (question_id),
	answer_id   integer references answers (answer_id)
);

insert into question_to_answer(question_id, answer_id)
values
	(1, 1),
	(1, 2),
	(1, 3),
	(2, 4),
    (2, 5),
    (2, 6),
    (2, 7),
    (3, 8),
    (3, 9),
    (3, 4),
    (3, 10),
	(3, 11);

select question_id, answer_id
from question_to_answer
order by question_id, answer_id;

-- -------------------------------
-- 4) Правильные ответы
-- -------------------------------
create table correctAnswers
(
	correctAnswer_id serial  primary key,
	question_nn		 integer,
	answer			 varchar(100)
);

insert into correctAnswers(question_nn, answer)
values
	(1, '60'),
	(2, '24'),
	(3, '12');

select correctAnswer_id, question_nn, answer
from correctAnswers
order by question_nn;

-- -------------------------------
select q.question_nn, q.question, a.answer, ca.answer as correctAnswer
from questions q
join question_to_answer qa on qa.question_id=q.question_id
join answers a on a.answer_id=qa.answer_id
join correctAnswers ca on ca.question_nn=q.question_nn;
