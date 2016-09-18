(defn nth_element [s n]
  (last
    (take (inc n) s)
  )
)

(= (nth_element '(4 5 6 7) 2) 6)
(= (nth_element [:a :b :c] 0) :a)
(= (nth_element [1 2 3 4] 1) 2)
(= (nth_element '([1 2] [3 4] [5 6]) 2) [5 6])
