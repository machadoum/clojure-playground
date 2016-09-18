(defn penultimate_element [n]
  (second (reverse n))
)

(= (penultimate_element (list 1 2 3 4 5)) 4)
(= (penultimate_element ["a" "b" "c"]) "b")
(= (penultimate_element [[1 2] [3 4]]) [1 2])
