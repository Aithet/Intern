/*
Создать запрос
для выборки всех преподавателей на курсах, у которых учатся больше 2000 студентов;
*/

SELECT COUNT(marks.student_id), teacher.first_name, teacher.last_name
FROM teacher, course,student , marks
WHERE course.id_teacher = teacher.id AND marks.student_id = student.id AND marks.course_id = course.id
GROUP BY course.id
HAVING COUNT(student.id) > 2000;

/*
Создать запрос
для выборки студентов, у которых по курсу 'Programming' оценка > 4, и отсортировать их по фамилии, имени;
*/

SELECT student.id, student.first_name , student.last_name FROM course, marks, student
WHERE student.id = marks.student_id AND course.id = marks.course_id AND course.course_title IN (‘Programming’) and mark > 4
ORDER BY student.last_name, student.first_name;

/*
Создать запрос
который выведет количество отличников, количество студентов и преподавателя в каждой группе.
*/

SELECT COUNT(marks.student_id), COUNT(student.id), teacher.id
FROM teacher, course,student , marks,groupp
WHERE groupp.id = student.group_id AND course.id_teacher = teacher.id AND marks.student_id = student.id AND marks.course_id = course.id and mark = 5
GROUP BY groupp.id;