(defn factors
  [x]
  (let [limit (quot x 2)]
    (map #(quot x %) (filter #(= (mod x %) 0) (take-while #(< % limit) (iterate #(+ % 2) 3))))))

(defn prime?
  [x]
  (cond
    (<= x 3) true
    (even? x) false
    :else (empty? (factors x))))


(println (first (filter prime? (factors 600851475143))))
