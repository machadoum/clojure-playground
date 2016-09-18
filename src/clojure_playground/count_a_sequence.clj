(defn count_a_sequence [s]
  ( reduce
    (fn [a v] (+ a 1) )
    0 s
  )
)

(= (count_a_sequence '(1 2 3 3 1)) 5)
(= (count_a_sequence "Hello World") 11)
(= (count_a_sequence [[1 2] [3 4] [5 6]]) 3)
(= (count_a_sequence '(13)) 1)
(= (count_a_sequence '(:a :b :c)) 3)
