(defn triple? 
  [[a b c]]
  (= (+ (* a a) (* b b)) (* c c)))

(time
  (println
    (apply *
      (first 
        (filter 
          triple? 
          (for [a (range 1 1000) b (range 1 1000)] [a b (- 1000 a b)]))))))
