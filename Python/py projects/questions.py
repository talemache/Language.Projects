class Question:
    def __init__(self, prompt, answer):
        self.prompt = prompt
        self.answer = answer


question_prompts = [
    "What color are apples?\n(a) Red (b) Green\n"
    "(c) Orange",
    "What color are bananas?\n(a) Red (b) Green\n"
    "(c) Yellow",
]

questions = [
    Question(question_prompts[0], "a"),
    Question(question_prompts[1], "b"),
]

def run_quiz(questions):
    score = 0
    for question in questions:
        answer = input(question.prompt)
        if answer == question.answer:
            score += 1
    print("you got", score, "out of", len(question))

run_quiz(questions)