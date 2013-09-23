(defn factors
  [x]
  (let [limit (java.lang.Math/sqrt x)]
    (map (fn [y] [y (quot x y)])
         (filter #(= (mod x %) 0) 
                 (take-while #(< % limit) (iterate #(+ % 2) 3))))))


(defn prime?
  [x]
  (cond
    (<= x 3) true
    (even? x) false
    :else (empty? (factors x))))


(println (first (filter prime? (sort > (flatten (factors 600851475143))))))
