DROP TABLE IF EXISTS messages;

CREATE TABLE messages (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  description VARCHAR(250) NOT NULL
);

INSERT INTO messages (description) VALUES
  ('Hello World!'),
  ('Hello World2!'),
  ('Hello World3!'),
  ('Hello World4!')
  ;