INSERT INTO posts (id,title, content, author) VALUES (1, 'Título del post', 'Contenido del post', 'Autor del post');
INSERT INTO posts (id,title, content, author) VALUES (2, 'Título del post', 'Contenido del post', 'Autor del post2');
INSERT INTO post_comments (id, comment, post_id) VALUES (1, 'Este es un comentario 1', 1),(2, 'Este es un comentario 2', 1);
INSERT INTO post_comments (id, comment, post_id) VALUES (3, 'Este es un comentario 3', 2);

CREATE OR REPLACE VIEW post_comment_view AS SELECT p.author, count(*) as comment_count from posts as p left join post_comments as pc on p.id=pc.post_id group by p.author order by count(*) desc;

CREATE MATERIALIZED VIEW post_summary AS SELECT p.author, count(p.author) as comment_count from posts as p left join post_comments as pc on p.id=pc.post_id group by p.author order by count(*) desc WITH DATA;
CREATE UNIQUE INDEX idx_post_summary_author ON post_summary (author);