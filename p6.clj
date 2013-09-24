(def xs (range 1 101))

(def square #(* % %))

(time (println (- (square (apply + xs)) (apply + (map square xs)))))
