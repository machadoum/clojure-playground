(defn sum_it_all_up [elements]
  ( reduce
    (fn [a v] (+ a v) )
    0 elements
  )
)

(= (sum_it_all_up [1 2 3]) 6)
(= (sum_it_all_up (list 0 -2 5 5)) 8)
(= (sum_it_all_up #{4 2 1}) 7)
(= (sum_it_all_up '(0 0 -1)) -1)
(= (sum_it_all_up '(1 10 3)) 14)
