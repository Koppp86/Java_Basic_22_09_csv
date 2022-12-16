-- -------------------------------
-- Создание новой БД
-- -------------------------------
create database Template;

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
	question_id integer 	 references questions (question_id),
	answer		varchar(100)
);

insert into answers(question_id, answer)
values
	(1, '60'),
	(1, '100'),
	(1, '50'),
	(2, '12'),
	(2, '24'),
	(2, '36'),
	(2, '48'),
	(3, '10'),
	(3, '11'),
	(3, '12'),
	(3, '13'),
	(3, '15');

select answer_id, question_id, answer
from answers
order by question_id, answer_id;

-- -------------------------------
-- 3) Правильные ответы
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
join answers a on a.question_id=q.question_id
join correctAnswers ca on ca.question_nn=q.question_nn;
